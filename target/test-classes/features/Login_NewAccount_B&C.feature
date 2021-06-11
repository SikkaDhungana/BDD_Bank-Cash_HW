@LoginFeature 
Feature: Techfios bank and cash New Account Functionality

Background: 
	Given User is on the techfios login page 
	
@Scenario
Scenario Outline: User should be able to login with valid credentials and open a new account	
	When User enters the "<username>" and "<password>" 
	And User clicks on login button
	Then User should be able to see the dashboard
	When User clicks on bank and cash 
	When User clicks on new account 
	When User fill up the form entering "<accountTitle>"and "<description>"and "<initialBalance>"and "<accountNumber>"and "<contactPerson>"and "<phone>"and "<internetBankingUrl>" and clicks on submit 
	Then User should be able to validate new account created 
	Examples:
		|username  			|password |accountTitle   |description 		   |initialBalance |accountNumber |contactPerson |phone 	 |internetBankingUrl						 |
		|demo@techfios.com	|abc123   |Saving Account |New Account Opening |150000   	   |2345678910    |Norah Smith   |8719865390 |https://www.techfios.com/billing/?ng=admin/|
	
	
#Home work(Due on 06/12/2021 09.00 am CST):
#Automate the following scenario by creating a new feature using Cucumber BDD Framework(which was built in class#11) 
#and push the code to your own github/bitbucket repository and email the project URL to mdislam@techfios.com


