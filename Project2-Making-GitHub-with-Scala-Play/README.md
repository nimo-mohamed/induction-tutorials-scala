# GitHub Exercise
- Please NOTE: These instructions maybe updated, please check GitHub for the most up-to-date instructions.

The GitHub API is documented here: https://docs.github.com/en/rest

We will be connecting to this API to create a version of 'GitHub'.
You should clone this repo (ssh link: git@github.com:MercatorDigital/gitHubExProject2.git).
We want to track changes to the project using git. Since we cloned this repo we are going to change the remote origin.

* Go to your GitHub account → Your repositories → Create new repository
    * Give it the same name as your local project
    * Ensure it is public
    * Ensure 'Initialise with README' is unticked
* Go to the command line/terminal:
    * We need to tell git where the remote GitHub repository is, so that we can push up changes. Run the following, substituting with your GitHub username and newly created project name
    * `git remote rename origin upstream` (The old origin is now renamed to upstream)
    * `git remote add origin git@github.com:<username>/<repo-name>.git` (A new origin is added, your github!)
    * e.g. `git remote add origin git@github.com:MercatorDigital/gitHubExProject2.git`

* Run `git remote -v` to check the remote is correct

* Run `git status`, and you can now see there are various files git has picked up but is not yet tracking any changes and only recognises a bunch of new folders and files.

* Run `git add .` to add all files in red to a 'staging area' in preparation for a final commit

* To make a commit, run `git commit -m "example message"` (Think of an appropriate message for the changes you've made)

* Push your new commit up to main `git push origin main` (Note: there are two places we 'can' push to, the old location, upstream, and your new one, origin.)

* Go to your new project on GitHub to check everything pushed up okay.

* In terminal type `sbt run`, in your browser on localhost:9000 you should see a page with the title "Welcome to your version of GitHub".

For package structure use standard:

* views
    * This contains the html templates which are the pages that are viewable in the browser.
* controller
    * API endpoint entry
    * Responsible for displaying views files
    * Interacts with the service layer

  Then make folders:
* service
    * Orchestration, should be lightweight seeing as we're only calling one endpoint
    * Service should contain all the logic and checks we want to happen. e.g. is the submitted data the correct format to be added into the database.
* connector
    * To send requests to external services (The GitHub API in this case)
* model
    * Domain model data representation
* repository
    * This contains the methods to interact with your database


Using the GitHub API you come across rate limits, if this occurs it can be easier if upfront you use your own git credentials for authorisation - https://developer.github.com/v3/auth/#basic-authentication (you may not need to worry about authorisation yet and can come back to this once you get to task 9 as authorisation is needed when you start manipulating repositories on the GitHub API.)

When writing your code only have working code on your main branch and for each new task create a branch to create this.

This is great practice as if we push directly to main we could potentially be breaking the code or cause merge conflicts.
We can make commits in an isolated branch that will not affect the code in main which should only ever be working code.

When the task is completed, you have written the corresponding tests, and they are passing create a pull request to merge your branch into main.

Make sure you are practicing test driven development by writing integration and unit tests for all your methods after you have written them.

There is less information in these instructions, you might need to do a bit of research and ask questions but this is great practice as a lot of development is research.

## Sections
* [Tasks](Tasks.md)

test