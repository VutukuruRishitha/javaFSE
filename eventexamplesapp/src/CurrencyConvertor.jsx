import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      amount: '',
      currency: ''
    };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(e) {
    this.setState({
      [e.target.name]: e.target.value
    });
  }

  handleSubmit(e) {
    e.preventDefault();
    const amountNum = parseFloat(this.state.amount);
    if (!isNaN(amountNum)) {
       const converted = amountNum * 80;
       alert(`Converting to Euro Amount is ${converted}`);
    }
  }

  render() {
    return (
      <div>
        <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>
        <form onSubmit={this.handleSubmit}>
          <div style={{ marginBottom: '10px' }}>
            <label style={{ display: 'inline-block', width: '80px' }}>Amount: </label>
            <input type="text" name="amount" value={this.state.amount} onChange={this.handleChange} />
          </div>
          <div style={{ marginBottom: '10px' }}>
            <label style={{ display: 'inline-block', width: '80px' }}>Currency: </label>
            <input type="text" name="currency" value={this.state.currency} onChange={this.handleChange} />
          </div>
          <div style={{ marginLeft: '80px' }}>
             <button type="submit">Submit</button>
          </div>
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;
