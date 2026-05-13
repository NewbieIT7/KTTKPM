const express = require("express");

const app = express();
const PORT = 3000;

app.get("/", (req, res) => {
  res.send("Hello from Bai4 Node.js + Express with Docker Compose!");
});

app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});
