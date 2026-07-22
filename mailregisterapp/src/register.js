import React, { Component } from 'react';
import './register.css';

const validEmailRegex = RegExp(/^(([^<>()\[\]\.,;:\s@\"]+(\.[^<>()\[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i);

const validateForm = (errors) => {
  let valid = true;
  Object.values(errors).forEach(
    // if we have an error string set valid to false
    (val) => val.length > 0 && (valid = false)
  );
  return valid;
};

class Register extends Component {
  constructor(props) {
    super(props);
    this.state = {
      fullName: null,
      email: null,
      password: null,
      errors: {
        fullName: 'Full Name must be 5 characters long!',
        email: 'Email is not valid!',
        password: 'Password must be 8 characters long!',
      }
    };
  }

  handleChange = (event) => {
    event.preventDefault();
    const { name, value } = event.target;
    let errors = this.state.errors;

    switch (name) {
      case 'fullName':
        errors.fullName =
          value.length < 5
            ? 'Full Name must be 5 characters long!'
            : '';
        break;
      case 'email':
        errors.email =
          validEmailRegex.test(value)
            ? ''
            : 'Email is not valid!';
        break;
      case 'password':
        errors.password =
          value.length < 8
            ? 'Password must be 8 characters long!'
            : '';
        break;
      default:
        break;
    }

    this.setState({ errors, [name]: value });
  }

  handleSubmit = (event) => {
    event.preventDefault();
    if (validateForm(this.state.errors)) {
      alert('Valid Form');
    } else {
      if (this.state.errors.fullName !== "") {
        alert(this.state.errors.fullName);
      }
      else if (this.state.errors.email !== "") {
        alert(this.state.errors.email);
      }
      else if (this.state.errors.password !== "") {
        alert(this.state.errors.password);
      }
    }
  }

  render() {
    return (
      <div className="register-container">
        <h2 style={{ color: 'red' }}>Register Here!!!</h2>
        <form onSubmit={this.handleSubmit} noValidate>
          <div className="form-group">
            <label>Name: </label>
            <input type="text" name="fullName" onChange={this.handleChange} noValidate />
          </div>
          <div className="form-group">
            <label>Email: </label>
            <input type="email" name="email" onChange={this.handleChange} noValidate />
          </div>
          <div className="form-group">
            <label>Password: </label>
            <input type="password" name="password" onChange={this.handleChange} noValidate />
          </div>
          <div className="submit-group">
            <button type="submit">Submit</button>
          </div>
        </form>
      </div>
    );
  }
}

export default Register;
