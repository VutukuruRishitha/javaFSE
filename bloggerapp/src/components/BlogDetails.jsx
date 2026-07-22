import React from 'react';

function BlogDetails({ showBlog }) {
  const blogs = [
    { id: 1, title: 'React Learning', author: 'Stephen Biz', desc: 'Welcome to learning React!' },
    { id: 2, title: 'Installation', author: 'Schewzdenier', desc: 'You can install React from npm.' }
  ];

  return (
    <div>
      {/* Using logical && for conditional rendering */}
      {showBlog && (
        <ul>
          {blogs.map(blog => (
            <li key={blog.id}>
              <h2>{blog.title}</h2>
              <h4>{blog.author}</h4>
              <p>{blog.desc}</p>
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default BlogDetails;
