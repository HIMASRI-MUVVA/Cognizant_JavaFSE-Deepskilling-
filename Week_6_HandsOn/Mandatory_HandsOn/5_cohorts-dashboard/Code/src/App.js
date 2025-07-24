// src/App.js
import React from 'react';
import CohortDetails from './CohortDetails'; // Import our new CohortDetails component
import './App.css'; // Keep the default App.css for basic app styling

function App() {
  // Dummy data for cohorts, matching the structure in the image
  const cohorts = [
    {
      name: "INTADMDF10 - .NET FSD",
      startDate: "22-Feb-2022",
      status: "Scheduled", // This cohort's title will be blue
      coach: "Aathma",
      trainer: "Jojo Jose"
    },
    {
      name: "ADM21JF014 - Java FSD",
      startDate: "10-Sep-2021",
      status: "Ongoing", // This cohort's title will be green
      coach: "Apoorv",
      trainer: "Elisa Smith"
    },
    {
      name: "CDBJF21025 - Java FSD",
      startDate: "24-Dec-2021",
      status: "Ongoing", // This cohort's title will be green
      coach: "Aathma",
      trainer: "John Doe"
    }
  ];

  return (
    <div className="App">
      <h1 style={{ textAlign: 'left', marginLeft: '20px' }}>Cohorts Details</h1> {/* Main heading for the page */}
      <div style={{
        display: 'flex',       // Use Flexbox for layout
        flexWrap: 'wrap',      // Allow cards to wrap to the next line
        justifyContent: 'center', // Center the cards horizontally
        gap: '20px',           // Space between the cards
        padding: '20px'        // Padding around the entire set of cards
      }}>
        {/* Map through the cohorts data and render a CohortDetails component for each */}
        {cohorts.map((cohort, index) => (
          <CohortDetails key={index} cohort={cohort} /> // 'key' prop is important for lists in React
        ))}
      </div>
    </div>
  );
}

export default App;