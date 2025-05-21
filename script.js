document.getElementById('contactForm').addEventListener('submit', function (e) {
  e.preventDefault();
  document.getElementById('msg').textContent = "Thanks! Your message has been sent.";
  this.reset();
});
