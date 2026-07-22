import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';
import './App.css'; // Optional, but leaving it if it's there

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 5
    };
    this.increment = this.increment.bind(this);
    this.decrement = this.decrement.bind(this);
    this.sayWelcome = this.sayWelcome.bind(this);
    this.handlePress = this.handlePress.bind(this);
  }

  increment() {
    this.setState({ counter: this.state.counter + 1 });
    alert("Hello Member1");
  }

  decrement() {
    this.setState({ counter: this.state.counter - 1 });
  }

  sayWelcome(message) {
    alert(message);
  }

  handlePress(e) {
    alert("I was clicked");
  }

  render() {
    return (
      <div style={{ padding: '20px' }}>
        <p>{this.state.counter}</p>
        <div style={{ marginBottom: '2px' }}>
          <button onClick={this.increment}>Increment</button>
        </div>
        <div style={{ marginBottom: '2px' }}>
          <button onClick={this.decrement}>Decrement</button>
        </div>
        <div style={{ marginBottom: '2px' }}>
          <button onClick={() => this.sayWelcome('welcome')}>Say welcome</button>
        </div>
        <div style={{ marginBottom: '20px' }}>
          <button onClick={this.handlePress}>Click on me</button>
        </div>

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
