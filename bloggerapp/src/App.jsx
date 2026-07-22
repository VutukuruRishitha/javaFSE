import React from 'react';
import './App.css';
import CourseDetails from './components/CourseDetails';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';

function App() {
  return (
    <div className="app-container">
      <div className="mystyle1">
        <h1>Course Details</h1>
        <CourseDetails showCourses={true} />
      </div>
      <div className="st2">
        <h1>Book Details</h1>
        <BookDetails showBooks={true} />
      </div>
      <div className="v1">
        <h1>Blog Details</h1>
        <BlogDetails showBlog={true} />
      </div>
    </div>
  );
}

export default App;
