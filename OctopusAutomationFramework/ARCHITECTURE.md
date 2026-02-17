1. Overview

This document outlines the software and codebase used for the automation testing framework. The framework is designed for end-to-end testing of web applications, ensuring reliability, maintainability, and scalability.

2. Tools & Software Used
| -----------------------| ------------------------------------------------------------------------------------------------------------------------------------------|
| Component              | Purpose                                                                                                                                   |
| ---------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| Selenium WebDriver     | Core automation tool for interacting with web browsers, performing actions like clicks, typing, and validations.                          |
| Eclipse IDE            | Development environment for writing, debugging, and managing Java-based test scripts.                                                     |
| Java                   | Primary programming language used to develop test scripts and implement automation logic.                                                 |
| TestNG                 | Testing framework used for managing test cases, test execution, reporting, and annotations like `@Test`, `@BeforeMethod`, `@AfterMethod`. |
| -----------------------| ------------------------------------------------------------------------------------------------------------------------------------------|


3. Framework Structure
Automation-Project/
│
├── src/main/java/           
├── src/test/java/
|   ├── base/            
│   ├── tests/               
│   ├── pages/               
│   └── utilities/              
├── test-output/             
├── pom.xml
├── testng.xml    
└── resources/               
