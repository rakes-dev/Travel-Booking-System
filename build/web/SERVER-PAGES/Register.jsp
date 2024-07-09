
<%--<%@ page import="java.net.URLEncoder" %>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration</title>

    <!-- custom css file link  -->
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../css/media.css">

    <script>
        
        document.addEventListener("DOMContentLoaded", function() {
          
        const selectElement = document.getElementById("gender");
        const termsLink = document.getElementById('terms-link');
        const termsCheckbox = document.getElementById('terms-checkbox');
        const closeBtn = document.getElementById('close-modal');
        const modal = document.getElementById('terms-modal');
        const acceptButton = document.getElementById('accept-terms');
        termsLink.addEventListener('click', function () {
            modal.style.display = 'block';
        });

        closeBtn.addEventListener('click', function () {
            modal.style.display = 'none';
        });

        window.addEventListener('click', function (event) {
            if (event.target == modal) {
                modal.style.display = 'none';
            }
        });

        acceptButton.addEventListener('click', function () {
            termsCheckbox.disabled = false;
            modal.style.display = 'none';
        });
        const form = document.getElementById("registrationForm");
        const submitBtn = document.getElementById("submit-button");
        termsCheckbox.disabled = true;

        form.addEventListener("input", function () {
            const allInputsValid = Array.from(form.elements).every((element) =>
                element.checkValidity()
            );
            selectElement.addEventListener("change", function () {
                if (this.value !== "") {
                    termsCheckbox.addEventListener("change", function () {
                        if (this.checked) {
                            submitBtn.disabled = allInputsValid;
                        } else {
                            submitBtn.setAttribute("disabled", "disabled");
                        }
                    });
                } else {
                    submitBtn.setAttribute("disabled", "disabled");
                }
            });

        });


        // Password check
        function validatePassword(event) {
//            event.preventDefault();
            var password = document.getElementById("password").value;
            var confirmPassword = document.getElementById("confirmPassword").value;

            if (password !== confirmPassword) {

                document.getElementById("error").innerHTML = "Passwords do not match!";
            } else {
                document.getElementById("error").innerHTML = ""; // Clear the error message
                regForm.classList.remove('active');
                loginForm.classList.remove('active');
                document.getElementById("registrationForm").submit();
            }
        } 
    });
      
    </script>

</head>

<body>

    <!-- Register form  -->

    <div class="register-form-container">

        <i class="fas fa-times" id="reg-close"></i>

        <form method="post" id="registrationForm"
            action="<%= request.getContextPath() %>/RegistrationServlet">
            <h3>Register</h3>
            <!-- <label for="first-name">First Name:</label> -->
            <input type="text" id="first-name" class="box" name="first_name" placeholder="First Name" required>
            <!-- <label for="last-name">Last Name:</label> -->
            <input type="text" id="last-name" class="box" name="last_name" placeholder="Last Name" required>

            <label for="birthdate">Date of Birth:</label>
            <input type="date" class="box" id="birthdate" name="birthdate" required>

            <label for="gender">Gender:</label>
            <select id="gender" class="box" name="gender">
                <option value="" disabled selected>Select your gender</option>
                <option value="male">Male</option>
                <option value="female">Female</option>
                <option value="other">Other</option>
            </select>

            <label for="email">Email:</label>
            <input type="email" class="box" id="emailInput" name="email" placeholder="example@gmail.com" required>

            <br>

            <label for="password">Password:</label>
            <input type="password" class="box" id="password" name="password" required>

            <label for="confirm-password">Confirm Password:</label>
            <input type="password" class="box" id="confirmPassword" name="confirm_password" required>

            <label for="terms">I have read and accept the <a href="#" id="terms-link">Terms and Conditions</a></label>
            <input type="checkbox" id="terms-checkbox" required>

            <div id="terms-modal" class="modal">
                <div class="modal-content">
                    <i class="fas fa-times" id="close-modal"></i>
                    <h2 style="background-color: #ffa500; text-align: center;">Travel Website Terms and Conditions</h2>
                    <!-- Your terms and conditions content here -->
                    <p>These Terms and Conditions govern your use of our travel website. By using our website, you agree
                        to comply with and be bound by these terms. If you do not agree with these terms, please do not
                        use this website.</p>

                    <h2>1. Website Use</h2>
                    <p>You agree to use this website for lawful purposes only and in a manner that does not violate the
                        rights of, or restrict or inhibit the use and enjoyment of this website by any third party.</p>

                    <h2>2. User Accounts</h2>
                    <p>To access certain features or services on our website, you may need to create a user account. You
                        are responsible for maintaining the confidentiality of your account information and for all
                        activities that occur under your account.</p>

                    <h2>3. Travel Bookings</h2>
                    <p>We facilitate travel bookings, but we do not operate, control, or supply travel services. We are
                        not responsible for the actions, errors, or omissions of travel service providers. Your bookings
                        are subject to their terms and conditions.</p>

                    <h2>4. Privacy</h2>
                    <p>We collect and use your personal information as described in our Privacy Policy. By using our
                        website, you consent to the collection and use of your personal information as described in the
                        Privacy Policy.</p>

                    <h2>5. Content and Copyright</h2>
                    <p>All content on this website, including text, images, logos, and software, is protected by
                        copyright and other intellectual property rights. You may not use or reproduce any of our
                        content without our express written consent.</p>

                    <h2>6. Disclaimer</h2>
                    <p>While we make every effort to ensure the accuracy of the information on our website, we do not
                        guarantee its accuracy. We are not responsible for any errors, omissions, or misrepresentations
                        in the content.</p>

                    <h2>7. Changes to Terms</h2>
                    <p>We may update these Terms and Conditions at any time. You should review this page periodically to
                        ensure you are aware of any changes. Your continued use of the website signifies your acceptance
                        of the revised terms.</p>

                    <h2>8. Contact Information</h2>
                    <p>If you have any questions or concerns about these Terms and Conditions, please contact us at
                        [Your Contact Information].</p>

                    <p>Last updated: [Date of Last Update]</p>
                    <button id="accept-terms" type="button" class="btn">Accept</button>
                </div>
            </div>

            <button onclick="validatePassword(event)" id="submit-button" type="submit" class="btn"
                disabled>register</button>
            <p id="error" style="color: red;"></p>
            <p>already have an account? <a href="#" id="form-link">login now</a></p>
        </form>

    </div>
</body>

</html>