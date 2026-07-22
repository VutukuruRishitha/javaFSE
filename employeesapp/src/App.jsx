import React, { useState } from 'react';
import EmployeesList from './EmployeesList';
import ThemeContext from './ThemeContext';
import './App.css';

function App() {
  const [theme, setTheme] = useState('light');

  const toggleTheme = () => {
    setTheme(prevTheme => prevTheme === 'light' ? 'dark' : 'light');
  };

  return (
    <ThemeContext.Provider value={theme}>
      <div className={`App ${theme}`}>
        <header>
          <h1>Employee Management Application</h1>
          <button onClick={toggleTheme}>
            Switch to {theme === 'light' ? 'dark' : 'light'} theme
          </button>
        </header>
        <EmployeesList />
      </div>
    </ThemeContext.Provider>
  );
}

export default App;
