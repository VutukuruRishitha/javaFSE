import React from 'react';

function CourseDetails({ showCourses }) {
  const courses = [
    { id: 1, name: 'Angular', date: '4/5/2021' },
    { id: 2, name: 'React', date: '6/3/20201' } // Kept the typo from the screenshot '6/3/20201' for exact match
  ];

  return (
    <div>
      {/* Using ternary operator for conditional rendering */}
      {showCourses ? (
        <ul>
          {courses.map(course => (
            <li key={course.id}>
              <h2>{course.name}</h2>
              <h4>{course.date}</h4>
            </li>
          ))}
        </ul>
      ) : (
        <p>Courses not available.</p>
      )}
    </div>
  );
}

export default CourseDetails;
