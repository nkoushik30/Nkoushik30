What is selenium ?

"Selenium is widely used in the e-commerce industry to automate testing of critical features like login, add to cart, and checkout, ensuring the application works correctly before deployment."


1. Introduction

Context: Why Selenium is needed in DevOps

• Banking applications are updated regularly to add security features and improve user experience.

• Every update can break critical features like login and money transfer.

• Manual testing is slow and cannot verify the application after every update.

• Selenium is used to automate browser testing and verify application functionality quickly.

• This ensures the banking application is safe and working before deployment.


2. What is Selenium

Definition and basic function

• Selenium is an open-source automation testing tool used to test web applications.

• It automates browser actions like typing, clicking, and navigating pages.

• It behaves like a real user interacting with the banking application.

• It verifies whether the login system works correctly.

• It ensures users can access their accounts without errors.

Real-Time Example Actions in Banking Application

• Selenium opens the banking website automatically.

• Selenium enters username and password.

• Selenium clicks the login button.

• Selenium verifies login success.

• Selenium reports pass or fail result.


3. Selenium in DevOps Pipeline

Pipeline Flow

GitHub → Jenkins → Selenium → Deployment

Step-by-Step Real-Time Usage in Banking Project

Step 1: Developer updates banking application

• Developer improves login security feature.

• Developer writes code in development environment.

• Code is tested locally.

• Code is pushed to GitHub repository.

• New version is ready for pipeline testing.

Step 2: Jenkins builds the project

• Jenkins detects new code automatically.

• Jenkins downloads updated code.

• Jenkins builds the banking application.

• Jenkins prepares test environment.

• Jenkins triggers Selenium testing.

Step 3: Selenium tests the banking application

• Selenium opens banking website.

• Selenium enters login credentials.

• Selenium clicks login button.

• Selenium verifies login success.

• Selenium generates test report.

Step 4: Deployment decision

• If test passes → Application deployed.

• If test fails → Deployment stopped.

• Failed test sent to developer.

• Developer fixes the issue.

• Application retested and deployed.


4. Major Uses of Selenium in DevOps
Use 1: Automated Testing

• Selenium tests banking login automatically.

• Selenium performs testing without human help.

• Selenium runs tests after every code update.

• Selenium verifies application functionality.

• Selenium reduces manual testing effort.

Use 2: Regression Testing

• Selenium ensures old banking features still work.

• Selenium tests login after update.

• Selenium detects broken features.

• Selenium prevents production failures.

• Selenium maintains application stability.

Use 3: Cross Browser Testing

• Selenium tests banking application in Chrome.

• Selenium tests banking application in Firefox.

• Selenium ensures browser compatibility.

• Selenium detects browser-specific issues.

• Selenium improves user experience.

Use 4: Continuous Integration with Jenkins

• Jenkins runs Selenium automatically.

• Selenium tests after every GitHub commit.

• Selenium ensures safe deployment.

• Selenium prevents broken releases.

• Selenium improves DevOps automation.


5. Real-World Example: Banking Application

Complete real-time workflow

• Developer updates banking login feature.

• Code pushed to GitHub repository.

• Jenkins builds application automatically.

• Selenium tests login functionality.

• Application deployed after successful testing.

Real-Time User Actions Tested by Selenium

• Opening banking website.

• Entering username and password.

• Clicking login button.

• Accessing user dashboard.

• Verifying successful login.


6. Advantages of Selenium in DevOps 
Advantage 1: Fast Testing

• Selenium completes testing quickly.

• Selenium runs tests automatically.

• Selenium reduces testing time.

• Selenium increases efficiency.

• Selenium supports continuous testing.

Advantage 2: Automation

• Selenium removes manual testing effort.

• Selenium works automatically in pipeline.

• Selenium improves productivity.

• Selenium reduces human errors.

• Selenium ensures reliable testing.

Advantage 3: Early Bug Detection

• Selenium detects login failures early.

• Selenium prevents faulty deployment.

• Selenium improves software quality.

• Selenium protects user experience.

• Selenium ensures safe application release.


8. Disadvantages of using Selenium

• Supports only web applications.

• Cannot test desktop applications.

• Cannot test native mobile applications.

• No built-in reporting system

• Requires external reporting tools

• Requires programming knowledge

• Tests are slower compared to API testing

• Requires frequent maintenance

• Test scripts break if UI changes

• No official technical support

• Requires third-party tools for full framework

• Limited support for image-based testing

• Parallel execution setup is complex



7. Conclusion

• Selenium is used to automate testing of banking web applications.

• Selenium ensures application works correctly before deployment.

• Selenium integrates with Jenkins and GitHub in DevOps pipeline.

• Selenium improves software quality and reliability.

• Selenium enables fast and safe deployment.




