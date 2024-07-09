let searchBtn = document.querySelector('#search-btn');
let searchBar = document.querySelector('.search-bar-container');
let formBtn = document.querySelector('#login-btn');
let loginpop = document.querySelector('#login');
// -----------------------------------------------------------
//------------------------------------------------------------
let menu = document.querySelector('#menu-bar');
let navbar = document.querySelector('.navbar');
//-------------------------------------------------
document.querySelectorAll('input[type="number"]').forEach(inputNumber => {
   inputNumber.oninput = () =>{
      if(inputNumber.value.length > inputNumber.maxLength) inputNumber.value = inputNumber.value.slice(0, inputNumber.maxLength);
   };
});

AOS.init({
   duration: 400,
   delay: 200,
});

window.onscroll = () =>{
    searchBtn.classList.remove('fa-times');
    searchBar.classList.remove('active');
    menu.classList.remove('fa-times');
    navbar.classList.remove('active');
}

menu.addEventListener('click' , () =>{
    menu.classList.toggle('fa-times');
    navbar.classList.toggle('active');
});

searchBtn.addEventListener('click' , () =>{
    searchBtn.classList.toggle('fa-times');
    searchBar.classList.toggle('active');
});

// var swiper = new Swiper(".review-slider", {
//     spaceBetween: 20,
//     loop: true,
//     autoplay: {
//         delay: 2500,
//         disableOnInteraction: false,
//     },
//     breakpoints: {
//         640: {
//             slidesPerView: 1,
//         },
//         768: {
//             slidesPerView: 2,
//         }, 
//         1024:{
//             slidesPerView: 3,
//         }, 
//     },
// });

var swiper = new Swiper(".brand-slider", {
    spaceBetween: 20,
    loop: true,
    autoplay: {
        delay: 2500,
        disableOnInteraction: false,
    },
    breakpoints: {
        450: {
            slidesPerView: 2,
        },
        768: {
            slidesPerView: 3,
        }, 
        991:{
            slidesPerView: 4,
        },
        1200:{
            slidesPerView: 5,
        }
    },
});
var swiper = new Swiper(".reviews-slider", {
    spaceBetween: 10,
    grabCursor: true,
    loop: true,
    centeredSlides: true,
    autoplay: {
        delay: 2500,
        disableOnInteraction: false,
    },
    breakpoints: {
        0: {
            slidesPerView: 1,

        },
        768: {
            slidesPerView: 2,

        },
        1024: {
            slidesPerView: 3,

        },
    },
});
//user name fetch from jdbc
//    document.addEventListener("DOMContentLoaded", function() {
//        // Assuming the user name is stored in a JavaScript variable
//        var userName = "<%= session.getAttribute("FIRST_NAME") != null ? session.getAttribute("FIRST_NAME") : "" %>";
//
//        // Display the user name in the login button
//        var loginButton = document.getElementById("login-btn");
//        var loginLink = document.getElementById("login-link");
//        
//        if (userName !== "") {
//            loginButton.innerHTML = '<span>' + userName + '</span>';
//            // Optionally, you can set the href attribute to a user profile page or similar
//            loginLink.href = "userProfile.html";
//        }
//    });
//

