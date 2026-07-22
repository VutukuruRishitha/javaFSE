import React, { Component } from 'react';

class CountPeople extends Component {
  constructor(props) {
    super(props);
    this.state = {
      entrycount: 0,
      exitcount: 0
    };

    this.updateEntry = this.updateEntry.bind(this);
    this.updateExit = this.updateExit.bind(this);
  }

  updateEntry() {
    this.setState((prevState, props) => {
      return { entrycount: prevState.entrycount + 1 }
    });
  }

  updateExit() {
    this.setState((prevState, props) => {
      return { exitcount: prevState.exitcount + 1 }
    });
  }

  render() {
    return (
      <div style={{ display: 'flex', justifyContent: 'space-around', marginTop: '100px', width: '100%' }}>
        <div>
          <button style={{ backgroundColor: 'lightgreen', padding: '2px 5px', marginRight: '5px', border: '1px solid black', borderRadius: '3px' }} onClick={this.updateEntry}>Login</button>
          <span>{this.state.entrycount} People Entered!!!</span>
        </div>
        <div>
          <button style={{ backgroundColor: 'lightgreen', padding: '2px 5px', marginRight: '5px', border: '1px solid black', borderRadius: '3px' }} onClick={this.updateExit}>Exit</button>
          <span>{this.state.exitcount} People Left!!!</span>
        </div>
      </div>
    );
  }
}

export default CountPeople;
