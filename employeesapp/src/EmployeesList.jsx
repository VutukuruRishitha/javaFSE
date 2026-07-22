import React from 'react';
import EmployeeCard from './EmployeeCard';

function EmployeesList() {
  const employees = [
    { id: 1, name: 'John Doe', designation: 'Software Engineer' },
    { id: 2, name: 'Jane Smith', designation: 'Project Manager' },
    { id: 3, name: 'Michael Johnson', designation: 'QA Engineer' }
  ];

  return (
    <div className="employees-list">
      {employees.map(emp => (
        <EmployeeCard key={emp.id} employee={emp} />
      ))}
    </div>
  );
}

export default EmployeesList;
