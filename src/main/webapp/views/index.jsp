<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Student Form</title>

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  
  <style>
    .form-container {
      max-width: 500px;
      margin: 0 auto;
      padding: 20px;
      border: 1px solid #ccc;
      border-radius: 5px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    .form-container h2 {
      text-align: center;
      margin-bottom: 20px;
    }

    .form-container .form-group label {
      font-weight: bold;
    }

    .form-container button {
      width: 100%;
    }
  </style>
</head>

<body>
  <div class="container">
    <div class="form-container">
      <h2>Student Form</h2>
      <form action="student">
        <div class="form-group">
          <label for="name">Name</label>
          <input type="text" class="form-control" id="name" placeholder="Enter your name" name="name">
        </div>
        <div class="form-group">
          <label for="email">Email</label>
          <input type="email" class="form-control" id="email" placeholder="Enter your email" name="email">
        </div>
        <div class="form-group">
          <label for="gender">Gender</label>
          <input type="text" class="form-control" id="gender" placeholder="Enter your gender" name="gender">
        </div>
        <div class="form-group">
          <label for="course">Course</label>
          <select id="course" class="form-control" name="course">
            <option selected>Choose...</option>
            <option>Java</option>
            <option>Python</option>
            <option>Mern</option>
            <option>C++</option>
          </select>
        </div>
        <div class="form-group">
          <label for="timing">Timing</label>
          <select id="timing" class="form-control" name="timing">
            <option selected>Choose...</option>
            <option>Morning</option>
            <option>Noon</option>
            <option>Evening</option>
          </select>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
      </form>
    </div>
  </div>
</body>

</html>
