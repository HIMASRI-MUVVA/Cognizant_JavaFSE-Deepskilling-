import React from 'react';
import ReactDOM from 'react-dom/client'; // Import from 'react-dom/client' for createRoot
import './index.css'; // Keep your existing index.css import
import App from './App';
import reportWebVitals from './reportWebVitals';

// Use createRoot instead of render for React 18+
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
