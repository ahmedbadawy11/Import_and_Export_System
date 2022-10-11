# Import_and_Export_System

## Description
IO System is a system to Import cases data(case data represent Specific topic to discuss it in an
organization and take actions to this topic , Case keeps information like Case Title , Case Id
,Case Date ,Case time , Responsible Manager For Case ,Case source this mean what is
management name for case like (civil management, violations management, Sales
management ,.....) , case has list of actions added by managers only) and convert those cases to
managers then take actions after that export or close those cases . cases can convert to more
than one manager
##This application has the following modules:
1-Come Cases
2-Outgoing Cases Keep information of case when export case to anther management like
(Outgoing ID , Outgoing Date , Outgoing time , Outgoing source this mean what is management
name for Outgoing case like (civil management, violations management, Sales management
,.....) , Notes , Case ID )
3-Managers
4- Cases Actions Keeps information like Action id , action date , action time , action type
like(&quot;اجتماع&quot;, &quot;تقارير&quot;, &quot;ضبط مخالفة&quot;,”اتصال”, “تم التصدير بخطاب”,” تعهد”) ,Notes
5-Cases Transactions Keeps information about transactions between managers like Case
convert From manager 1 to manager 2 so we need to save this information ( From Manager ID ,
to manager ID , date of transaction(4/6/2018) , time of transaction(4:30 pm) , Case ID )
##Functions:
1-add/edit/delete Come Cases, Outgoing Cases, managers, Cases Actions, Cases Transactions.
2- can assign cases to managers
3-manager can add actions to cases
4-manager can convert case to another manager
5-can close/finish case in it’s management after finish/close it can’t export .
6-can export cases
7-Managers only can delete , edit ,close/finish ,export , add actions to cases
8-Data entry create/add cases and assign cases for the first time only to manager,
Add/edit/delete managers

*Example to specific case
(Case Title) “بشأن وجود كيابل كهرباء مكشوفة وممددة على سطح الارض في ارض فضاء واقعة بالزماللك.”
This topic Convert to manager in Violation Management (Case Source )To take action on it like
“ضبط مخالفة” (Action Type) and manager 1 will send/export this case to another manager in
another management like civil management (Outgoing source)
