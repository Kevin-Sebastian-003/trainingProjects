<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Student Registration Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/common.css">
    <style>
        .note {
            text-align: center;
            height: 80px;
            background: -webkit-linear-gradient(left, rgb(0, 0, 0), rgb(63, 63, 63));
            color: #fff;
            font-weight: bold;
            line-height: 80px;
        }
        .form-content {
            text-align: center;
            padding: 5%;
            border: 1px solid #ced4da;
            margin-bottom: 2%;
        }
        .form-control {
            text-align: center;
            border-radius: 1.5rem;
        }
        .btnSubmit {
            position: absolute;
            bottom: 10%;
            left: 10%;
            border: none;
            border-radius: 1.5rem;
            padding: 1%;
            width: 20%;
            cursor: pointer;
            background: #0062cc;
            color: #fff;
        }
        .lead{
            position:fixed;
            bottom: 7%;
            right: 10%;
        }
        h7 {
            color: #fff;
        }
    </style>
</head>

<body>
    <h7>${errorMessage}</h7>
    <springForm:form method="POST" action="/StudentRegistration" modelAttribute="studentModel">
    <div class="container register-form">
        <div class="form">
            <div class="note">
                <p>Enter Student Details</p>
            </div>

            <div class="form-content">
                <div class="col">
                    <div class="row-md-6">
                        <div class="form-group">
                            <springForm:input path="id" class="form-control" placeholder="ID" value="" />
                        </div>
                    </div>
                    <div class="row-md-6"></div>
                        <div class="form-group">
                            <springForm:input path="email" class="form-control" placeholder="Email *" value="" />
                        </div>
                    </div>
                    <div class="row-md-6">
                        <div class="form-group">
                            <springForm:input path="name" class="form-control" placeholder="Name *" value="" />
                        </div>
                    </div>
                    <div class="row-md-6">
                        <div class="form-group">
                            <springForm:input path="age" class="form-control" placeholder="Age *" value="" />
                        </div>
                    </div>
                    <div class="row-md-6">
                        <div class="form-group">
                            <springForm:input path="dept" class="form-control" placeholder="Department *" value="" />
                        </div>
                    </div>
                    <div class="row-md-6">
                        <div class="form-group">
                            <springForm:input path="year" class="form-control" placeholder="Year *" value="" />
                        </div>
                    </div>
                </div>
                <input type="submit" class="btnSubmit" value="Submit"/>
            </div>
            <p class="lead">
                <a href="Home" class="btn btn-lg btn-secondary">Home</a>
            </p>
        </div>
    </div>
    </springForm:form>
</body>>

</html>