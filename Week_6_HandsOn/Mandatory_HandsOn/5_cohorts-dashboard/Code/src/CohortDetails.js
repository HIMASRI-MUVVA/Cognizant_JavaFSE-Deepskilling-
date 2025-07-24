// src/CohortDetails.js
import React from 'react';
import styles from './CohortDetails.module.css'; // Import the CSS Module

function CohortDetails({ cohort }) {
  // Destructure cohort properties from props
  const { name, startDate, status, coach, trainer } = cohort;

  // Conditional styling for the cohort name (<h3> element)
  // Green for "Ongoing" status, Blue for all other statuses
  const titleStyle = {
    color: status === 'Ongoing' ? 'green' : 'blue'
  };

  return (
    <div className={styles.box}> {/* Apply the 'box' class from the CSS Module */}
      <h3 style={titleStyle}>{name}</h3> {/* Apply the conditional color style */}
      <dl> {/* Description list to structure the details */}
        <dt>Started On</dt>
        <dd>{startDate}</dd>

        <dt>Current Status</dt>
        <dd>{status}</dd>

        <dt>Coach</dt>
        <dd>{coach}</dd>

        <dt>Trainer</dt>
        <dd>{trainer}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;