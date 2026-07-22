import React from 'react';
import './App.css';

function App() {
  const element = "Office Space";
  const jsxatt = <img src="/office_space.png" width="25%" height="25%" alt="Office Space"/>;
  
  const items = [
    { Name: "DBS", Rent: 50000, Address: "Chennai" }
  ];

  return (
    <div className="App">
      <h1>{element}, at Affordable Range</h1>
      {jsxatt}
      {items.map((ItemName, index) => {
        let colors = [];
        if (ItemName.Rent <= 60000) {
          colors.push('textRed');
        } else {
          colors.push('textGreen');
        }
        
        return (
          <div key={index}>
            <h1>Name: {ItemName.Name}</h1>
            <h3 className={colors.join(' ')}> Rent: Rs. {ItemName.Rent}</h3>
            <h3> Address: {ItemName.Address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default App;
