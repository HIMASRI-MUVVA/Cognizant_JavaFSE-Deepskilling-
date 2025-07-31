// src/App.js
import React, { useState } from 'react';
import './App.css'; // Import the main CSS file
import EmployeesList from './EmployeesList';
import ThemeContext from './ThemeContext'; // Import the ThemeContext

function App() {
  // State to manage the current theme (light or dark)
  const [theme, setTheme] = useState('light');

  // Function to toggle between light and dark themes
  const toggleTheme = () => {
    setTheme(currentTheme => (currentTheme === 'light' ? 'dark' : 'light'));
  };

  return (
    // ThemeContext.Provider makes the 'theme' value available to all
    // components nested within it, regardless of how deep they are.
    <ThemeContext.Provider value={theme}>
      {/* Apply a class to the main App div based on the current theme */}
      <div className={`App ${theme}`}>
        <header className="App-header">
          <h1>Employee Management Application</h1>
          {/* Button to toggle the theme */}
          <button onClick={toggleTheme} className={`toggle-button button-${theme}`}>
            Toggle to {theme === 'light' ? 'Dark' : 'Light'} Theme
          </button>
        </header>
        {/* EmployeesList and its children will now consume the theme from context */}
        <EmployeesList />
      </div>
    </ThemeContext.Provider>
  );
}

export default App;
