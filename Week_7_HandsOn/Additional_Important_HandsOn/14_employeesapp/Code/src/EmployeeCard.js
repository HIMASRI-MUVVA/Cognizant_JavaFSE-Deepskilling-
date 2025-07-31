// src/EmployeeCard.js
import React, { useContext } from 'react';
import ThemeContext from './ThemeContext'; // Import the ThemeContext

function EmployeeCard({ employee }) {
  // Use the useContext hook to get the current theme value from the nearest ThemeContext.Provider
  const theme = useContext(ThemeContext);

  // The className for the card and button will dynamically change based on the 'theme' value
  return (
    <div className={`employee-card ${theme}`}>
      <h3>{employee.name}</h3>
      <button className={`button-${theme}`}>View Profile</button>
    </div>
  );
}

export default EmployeeCard;
