import React from 'react';

function CalculateScore(props) {
  const { Name, School, Total, Goal } = props; // Destructuring props

  // Basic calculation for average score
  const averageScore = Total / Goal;

  return (
    <div className="score-card">
      <h2>Student Score Details</h2>
      <p><strong>Name:</strong> {Name}</p>
      <p><strong>School:</strong> {School}</p>
      <p><strong>Total Score:</strong> {Total}</p>
      <p><strong>Goal:</strong> {Goal}</p>
      <p><strong>Average Score:</strong> {averageScore.toFixed(2)}</p> {/* Displaying average with 2 decimal places */}
    </div>
  );
}

export default CalculateScore;