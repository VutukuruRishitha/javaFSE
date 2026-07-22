import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = ({ cohortName, startDate, status, coach, trainer }) => {
  const h3Style = {
    color: status.toLowerCase() === 'ongoing' ? 'green' : 'blue'
  };

  return (
    <div className={styles.box}>
      <h3 style={h3Style}>{cohortName}</h3>
      <dl>
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
};

export default CohortDetails;
