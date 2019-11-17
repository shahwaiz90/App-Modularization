# App-Modularization
This is a sample project to demonstrate communication between modules.  

I've created a sample project (https://github.com/shahwaiz90/App-Modularization) for your assignment 4, in which partial screen time functionality is used in a separate module. It has partial implementation of Room database module as well. Make a pull request or clone this repo.



In this project, your "app/main" module is using all modules to instantiate them. Then there is another module named: "screentime" which uses another module which is "roomdatabase" to store some data on the screen on event.



Please have a look and if still not able to understand then meet me in the office on Monday from 11:30 to 2pm or may be onwards. You can clone this project and use it for your assignment as well. 



So students who are stuck in communication between different modules or resolving conflicting dependencies can get a lot of help from it. 



Please see this video tutorial as well to fully grasp the idea of modularisation from google engineers. Worth seeing the whole video (https://www.youtube.com/watch?v=PZBg5DIzNww) 


I've also integrated a Stetho (http://facebook.github.io/stetho/) Library in it for easy debugging using chrome. Just launch this project and in your chrome browser type (chrome://inspect/#devices) in your chrome, to see database rows which were inserted from app (when screen is turned on after you press start).
