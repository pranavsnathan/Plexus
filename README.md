# Plexus
This java swing based application is a platform for information exchange between new students who are coming in do their masters in USA and the various university ambassadors and graduate students who are already staying in USA.
The workflow connects every possible organization who can provide information and can make changes to help the new students for their easy transitioning before kickstarting their masters program.
There are 7 organizations in the application namely:
1) Newbies (New students)
2) Graduate Students 
3) College Ambassadors
4) Dean of the College
5) Co-op advisors 
6) College Alumni
7) Dean of the University
This application revolves around newbies connecting to ambassadors for asking college related queries and to graduate students for asking
housing, grocery shopping and general hacks about living. They can also connect to grad students to ask more details regarding their course
selection, research and teaching assistant opportunities. The newbies and the graduate students are connected to each other via the ambassador.
When a query beyond the scope of an ambassador is asked to that organization, the ambassador forwards that to the graduate student or the dean.
The main point of sending queries to dean is to make the dean understand the sentiments of the new students and voice their concerns so that
necessary changes can be brought. The graduate students can connect to the college alumni to ask for the techonologies used in the company,
work culture etc. Graduate students are connected to the alumni via the advisor. The dean (if he feels like making a change and is beyond his
power) can send a work request to the university dean.

Main features of the application:
The connections between newbie, gradstudent and alumni is occuring via socket clinet server chat application. A neural network is also
implemented in the application which keeps a score. The score varies according to the feedback the customers provide. For example, in the
application, there is a question asked "was the chat helpful?". If customers click on yes, then the score increases and when he click on no,
the score decreases. The admin can come to know how the application is functioning by looking at the score. Apart fromt this, there is also
visualization bar graphs implemented to show sentiment analysis of the new students coming in. A mail functionality is also implemented which
allows the ambassador to send out mails if he/she receives any announcement from the dean.
