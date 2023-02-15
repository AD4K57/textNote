# textNote

## How to Run

Open a terminal and paste the following command:

```sh
docker-compose up --build
```

### What this command does

- Starts the backend service on port `8080` with the `test` profile.
- Starts the frontend service on port `3000`.

> If you want to change the profile of the backend service, you can modify it in the `docker-compose.yml` file. **(Profiles: test, dev)**

---

## Warning

> Since the `dev` profile is not fully ready yet, you need to first run a mysql container with port number `3310`.
