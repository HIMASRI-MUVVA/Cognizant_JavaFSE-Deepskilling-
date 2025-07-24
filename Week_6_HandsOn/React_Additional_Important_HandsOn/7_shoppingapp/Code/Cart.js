import React, { Component } from "react";

class Cart extends Component {
  render() {
    return (
      <tr>
        <td style={{ border: "1px solid black", padding: "8px" }}>
          <b>{this.props.Itemname}</b>
        </td>
        <td style={{ border: "1px solid black", padding: "8px", textAlign: "center" }}>
          ${this.props.Price}
        </td>
      </tr>
    );
  }
}

export default Cart;
