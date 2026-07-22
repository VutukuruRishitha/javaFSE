import React from 'react';
import { createRoot } from 'react-dom/client';
import './index.css';
import { OnlineShopping } from './OnlineShopping';

createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <OnlineShopping />
  </React.StrictMode>
);
