# Use the official Node.js Docker image (version 16.19.0)
FROM node:16.19.0

# Set the working directory to /app
WORKDIR /app

# Copy package.json and install dependencies using yarn
COPY package.json .
RUN yarn

# Copy the application code
COPY . .

# Expose port 3000 for the application
EXPOSE 3000

# Run the application using the "dev" command with yarn
CMD ["yarn", "dev"]
