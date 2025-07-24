// src/Posts.js
import React from 'react';
import Post from './Post.js';   // Import the Post class we just made!

class Posts extends React.Component {
  constructor(props) { // 
    super(props); // 
    this.state = {
      posts: [], // Initialize state with an empty array for posts [cite: 21]
      hasError: false // Add a state to track if an error occurred
    };
  }

  // Method to fetch posts from the API [cite: 22]
  async loadPosts() { // [cite: 22]
    try {
      // Use the Fetch API to get posts from the specified URL [cite: 22, 23]
      const response = await fetch('https://jsonplaceholder.typicode.com/posts'); // [cite: 23]
      if (!response.ok) {
        // If response is not OK (e.g., 404, 500), throw an error
        throw new Error(`HTTP error! status: ${response.status}`);
      }
      const data = await response.json();
      // Map the fetched data to instances of our Post class
      const fetchedPosts = data.map(item => new Post(item.id, item.title, item.body));
      this.setState({ posts: fetchedPosts }); // Assign fetched posts to component state [cite: 22]
    } catch (error) {
      console.error("Failed to load posts:", error);
      this.setState({ hasError: true }); // Update state to indicate an error
    }
  }

  componentDidMount() { // [cite: 25, 26]
    // Call loadPosts when the component is mounted to the DOM [cite: 25]
    this.loadPosts(); // [cite: 25]
  }

  // Error boundary lifecycle method [cite: 29, 30]
  componentDidCatch(error, info) { // [cite: 29]
    console.error("Component did catch an error:", error, info);
    // Display an alert message when an error happens [cite: 29]
    alert("Oops! Something went wrong in the Posts component. Check the console for details. 😬");
    this.setState({ hasError: true }); // Update state to show an error message
  }

  render() { // [cite: 27, 28]
    const { posts, hasError } = this.state;
    
    // If an error occurred, display an error message
    if (hasError) {
      return <div><h3>Something went wrong loading the posts! 😞</h3></div>;
    }

    return (
      <div>
        <h1>Blog Posts 📝</h1>
        {posts.length > 0 ? (
          // Display the title and body of posts [cite: 27]
          posts.map(post => (
            <div key={post.id} style={{ border: '1px solid #eee', padding: '10px', margin: '10px 0', borderRadius: '5px', backgroundColor: '#f9f9f9' }}>
              <h2>{post.title}</h2> {/* Display title using heading [cite: 27] */}
              <p>{post.body}</p> {/* Display body using paragraphs [cite: 27] */}
            </div>
          ))
        ) : (
          <p>Loading posts... If nothing shows up, maybe there are no posts or something went wrong! 🧐</p>
        )}
      </div>
    );
  }
}

export default Posts;