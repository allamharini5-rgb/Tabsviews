This is a Communication System assignment developed using Spring Boot, JPA, PostgreSQL, and JavaScript.

The application provides Email, SMS, and WhatsApp tabs. Each tab contains a form to submit data and a list view to display records stored in the database. No real Email, SMS, or WhatsApp is sent; the application only performs database operations.

## Output Check
1. Run the Spring Boot application.
2. Open the browser and go to http://localhost:8080/
3. Select any tab (Email / SMS / WhatsApp).
4. Enter details in the form and click Submit.
5. The submitted data will be saved in the database and immediately displayed in the corresponding list view.

The backend exposes REST APIs, and the frontend uses JavaScript fetch calls to retrieve and display data.