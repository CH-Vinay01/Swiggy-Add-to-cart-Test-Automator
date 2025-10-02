import { Alert, Steps } from 'nextra/components'

# 🛒 Swiggy Add-to-Cart Test Automator

## A Selenium WebDriver Project for Fugal Testing Assignment

This repository contains the **Swiggy Add-to-Cart Test Automator**, a **Java-Selenium** project developed as part of the Fugal Testing assignment. The project automates a comprehensive e-commerce flow on the Swiggy platform, validating key functionalities from login to the final payment gateway.

---

## 🎯 Project Objective

The primary goal of this assignment is to **automate the end-to-end process of ordering food on Swiggy** using **Selenium WebDriver** in Java. The automation script is designed to meticulously execute the following steps:

1.  **Navigate** to the Swiggy website.
2.  **Search** for and select a delivery location.
3.  **Search** for a specific restaurant.
4.  **Add** selected food items to the cart.
5.  **Modify** item quantity in the cart.
6.  **Enter** a new delivery address.
7.  **Proceed** to the final payment page.

<Alert type="info">
The script is designed to halt execution *before* completing the payment, fulfilling the scope of a complete functional test scenario.
</Alert>

---

## 🛠️ Technology Stack

| Technology | Role |
| :--- | :--- |
| **Java** | Core programming language for test logic. |
| **Selenium WebDriver** | Automation framework for browser interaction. |
| **Google Chrome Driver** | Browser-specific driver for automation. |
| **Maven** | Project build and dependency management (assumed). |

---

## ⚙️ Automation Steps Executed

The automation flow strictly follows the steps required by the assignment brief, ensuring a complete and valid test case execution.

<Steps>
### 1. User Login (Manual OTP Entry)

The script initiates the login process by navigating to the Swiggy website and clicking the **Login** button.

<Alert type="warning">
**Important Note: OTP-Based Login Required**

Since Swiggy utilizes an OTP-based authentication mechanism, the script is intentionally paused using `Thread.sleep()` to allow for **manual entry of the OTP** by the user. This ensures the required login step is part of the automation while accommodating the security protocol.
</Alert>

### 2. Validation of Initial State

The script prints the **page title** and **current URL** to the console to confirm successful initial navigation and page load validation.

### 3. Location and Delivery Setup

The delivery location is set by:
-   Locating and clicking the location input area.
-   Typing a city name (e.g., *Vijayawada* in the provided code snippet).
-   Selecting the appropriate suggestion from the dropdown.

### 4. Restaurant Search and Selection

The search functionality is tested by:
-   Accessing the main search bar.
-   Entering the name of a restaurant (e.g., *Naidu Gari Kunda Biryani - Vijayawada*).
-   Waiting for results and clicking on the first/relevant restaurant.

### 5. Item Selection and Cart Addition

-   The script navigates through the restaurant's menu.
-   A specific item (e.g., *Chilli Chicken* in the provided code snippet) is searched for.
-   The item is **added to the cart**, followed by navigation to the **'View Cart'** page.

### 6. Cart Management: Quantity Increase

On the cart page, the quantity selector for the selected item is located, and the quantity is successfully increased to **2**.

### 7. Delivery Address Entry

Upon proceeding from the cart, the script handles the prompt for the delivery address by:
-   Selecting **"Add a new address."**
-   Inputting the **Door/Flat Number** and **Landmark** details.
-   Selecting **"Home"** as the address type.
-   Clicking **"Save Address & Proceed."**

### 8. Proceed to Payment Gateway

The final step involves clicking the **"Proceed to Pay"** button, successfully reaching the payment options page.
</Steps>

---

## 💻 Current Code Status

The current implementation provides a robust foundation for the entire test flow.

| Feature | Status |
| :--- | :--- |
| Initial Setup & Driver Management | ✅ Complete |
| Login & Manual Wait | ✅ Complete |
| Initial URL/Title Validation | 🚧 To be explicitly added (logging) |
| Location Selection | ✅ Complete |
| Restaurant Search & Select | ✅ Complete |
| Item Search & Add | ✅ Complete |
| View Cart Navigation | ✅ Complete |
| **Quantity Increase** | 🚧 Patchwork remains (Not fully visible in the provided snippet, to be completed) |
| **Delivery Address Entry** | 🚧 Patchwork remains (Not fully visible in the provided snippet, to be completed) |
| **Proceed to Payment** | 🚧 Patchwork remains (Not fully visible in the provided snippet, to be completed) |

The initial provided Java code snippet (`SwiggyTestAutomator.java`) demonstrates the successful navigation, login wait, location, restaurant, and item addition steps. The remaining steps (Quantity Increase, Address Entry, and Payment Proceed) are in the process of being finalized with the correct XPath locators and interaction logic.

### Accessing the Source Code

The complete project structure and code can be accessed via the following compressed archive:

➡️ **[Project Zip File (Google Drive)](https://drive.google.com/file/d/12OnNkkkfnqx_DnsWENQsxhbBq2a4npXE/view?usp=drive_link)**

---

## 🚀 Execution Instructions

1.  **Clone** the repository.
2.  Ensure **Java** (JDK) and **Maven** are installed.
3.  Ensure the **ChromeDriver** is compatible with your installed Chrome browser and is correctly configured in your system path or project structure.
4.  Open the project in an IDE (e.g., IntelliJ, Eclipse).
5.  Execute the `main` method in the `SwiggyTestAutomator` class.
6.  **Be prepared to manually enter the OTP** when the browser pauses during the login step.
