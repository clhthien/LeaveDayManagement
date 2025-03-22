## API Specification

### Users APIs

#### 1. Register user
- **URL**: `POST /users/add`
- **Description**: Thêm tài khoản người dùng.
- **Request Body**:
  ```json
  {
     "email": "Nguyen Cong Thanh",
     "email": "johndoe10@example.com",
     "password": "securepassword"
  }
  ```
- **Response**:
    - `200 OK`: Register successfully.
      ```json
      {
          "status": 200,
          "message": "Add user successfully"
      }
      ```
    - `401 User existed`
      ```json
      {
         "status": 401,
         "message": "Email is already in use"     
      }
      ```
  

#### 2. Update user
- **URL**: `PUT /users/update`
- **Description**: Cập nhật người dùng.
- **Request Body**:
  ```json
  {
     "email": "Nguyen Thi Anh Dao",
     "email": "johndoe10@example.com",
     "password": "securepassword"
  }
  ```
  - **Response**:
      - `200 OK`: Added successfully.
        ```json
        {
            "status": 200,
            "message": "Update user successfully",
            "user": {
                "id": 1,
                "name": "Nguyen Cong Thanh",
                "email": "johndoe10@example.com",
                "password": "securepassword",
                "role": "EMPLOYEE"
            }
        }
        ```
      - `404 Users existed`
        ```json
        {
           "status": 404,
           "message": "User not found"     
        }
        ```

#### 3. Delete users
- **URL**: `DELETE users/delete/{id}`
- **Description**: Xóa người dùng.
- **Path variable**: long id
- **Response**:
    - `200 OK`: Deleted successfully.
      ```json
      {
          "status": 200,
          "message": "User deleted successfully"
      }
      ```
    - `404 User not found`
        ```json
          {
            "statusCode": 404,
            "message": "Device not found"     
          }
        ```

#### 4. View 1 User
- **URL**: `DELETE users/view/{id}`
- **Description**: Xem 1 người dùng.
- **Path variable**: long id
  - **Response**:
      - `200 OK`: View successfully.
        ```json
        {
        "status": 200,
        "message": "User found",
        "userDTO": {
                "id": 1,
                "name": "Andy",
                "email": "johndoe10@example.com"
            }
        }
        ```
      - `404 User not found`
          ```json
            {
              "statusCode": 404,
              "message": "User not found"     
            }
          ```