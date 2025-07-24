import React, { Component } from "react";
import Cart from "./Cart";

class OnlineShopping extends Component {
  render() {
    const cartItems = [
      { Itemname: "Laptop", Price: 50000 },
      { Itemname: "Mobile", Price: 20000 },
      { Itemname: "Headphones", Price: 3000 },
      { Itemname: "Keyboard", Price: 1500 },
      { Itemname: "Mouse", Price: 800 }
    ];

    return (
      <div style={{ textAlign: "center", marginTop: "50px" }}>
        <h1>Online Shopping</h1>
        <h2>Items Ordered:</h2>
        <table style={{ margin: "0 auto", borderCollapse: "collapse" }}>
          <thead>
            <tr>
              <th style={{ border: "1px solid black", padding: "8px" }}>Item Name</th>
              <th style={{ border: "1px solid black", padding: "8px" }}>Price</th>
            </tr>
          </thead>
          <tbody>
            {cartItems.map((item, index) => (
              <Cart key={index} Itemname={item.Itemname} Price={item.Price} />
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default OnlineShopping;
