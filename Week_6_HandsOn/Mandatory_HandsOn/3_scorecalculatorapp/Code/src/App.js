import React from 'react';
import CalculateScore from './Components/CalculateScore'; // Adjust path if you placed 'Components' elsewhere
import './Stylesheets/mystyle.css'; // Adjust path if you placed 'Stylesheets' elsewhere

function App() {
  return (
    <div className="App">
      <h1>Student Management Portal</h1>
      <CalculateScore Name="Alice" School="Greenwood High" Total={95} Goal={100} />
      <CalculateScore Name="Bob" School="Riverside Academy" Total={80} Goal={100} />
      <CalculateScore Name="Charlie" School="Maplewood Prep" Total={70} Goal={90} />
    </div>
  );
}

export default App;