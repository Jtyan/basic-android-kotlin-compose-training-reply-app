package com.example.reply.test

/*
* Use annotations to group test for different screen sizes
* You might realize from the previous tests that some tests fail when they are run on devices with an incompatible screen size.
* While you can run the test one by one using an appropriate device, this approach might not scale when you have many test cases.
* To solve this problem, you can create annotations to denote the screen sizes that the test can run on,
* and configure the annotated test for the appropriate devices.
 */
annotation class TestCompactWidth
annotation class TestMediumWidth
annotation class TestExpandedWidth

/*
To ensure success, configure the test to only run tests that are annotated with TestCompactWidth.
 */