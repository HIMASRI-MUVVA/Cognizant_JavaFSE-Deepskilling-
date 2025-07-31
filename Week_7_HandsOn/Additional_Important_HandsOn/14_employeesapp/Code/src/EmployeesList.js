// src/EmployeesList.js
import React from 'react';
import EmployeeCard from './EmployeeCard';

function EmployeesList() {
  // Sample employee data
  const employees = [
    { id: 1, name: 'John Doe' },
    { id: 2, name: 'Jane Smith' },
    { id: 3, name: 'Peter Jones' },
    { id: 4, name: 'Alice Brown' },
  ];

  return (
    <div className="employees-list">
      <h2>Our Employees</h2>
      {employees.map(employee => (
        // EmployeeCard no longer receives a 'theme' prop
        <EmployeeCard key={employee.id} employee={employee} />
      ))}
    </div>
  );
}

export default EmployeesList;
