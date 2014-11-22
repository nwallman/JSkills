This is a fork I made of: https://github.com/nsp/JSkills

I evaluating this API for a project and I wanted to go ahead and modernize the code a bit.  So I altered the project in the following manner:

1.) Created a Gradle build.  No only easier to build but to manage dependencies as well.
2.) Converted to Junit tests.  I did this primarily because it's the standard these days.
3.) Removed the dependency on Lombok. If syntax sugar is what you want then I recommend Groovy.

The following is what is left from the original readme:

The code for the TrueSkill calculator is in the "Skills" folder and its unit
tests are in the "UnitTests" folder.

For more details, see the "README" file in each of those folders.



