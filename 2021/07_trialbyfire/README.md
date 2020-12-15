# Lesson 7 - Trial By Fire
A lesson to be remembered, taught by yours truly!

### Before we proceed...
This lesson will not be like any other lesson that you have been taught thus far. This is largely due to the fact that it will not be a lesson at all. Today, all of you will be putting your crooked Stuy heads together to code something *all by yourselves*! That's right, you heard me. *All by yourselves*! That means that while oldbies will be present in every small group today, they will **be taking minimal action to help you**.

### Today's activity will test you in..
#### 1. Class Co-dependence
Each small group will be assigned (at random) to either code the **Point** or **Triangle** class. Both classes need the other in order to successfully and smoothly pass all of the given tests that will be thrown at them at the end of the activity period. That means that if even one group fails, both groups will fail.
#### 2. Git
Each small groups will be responsible for initializing and maintaining a **new** git branch. Every group must commit regularly, documenting their work in an (at least somewhat) orderly fashion. Use that SAT vocabulary to write some epic commit messages. I'm sure you can think of something.
#### 3. Teamwork
Whether you like it or not, you are part of a team now. Over the next <kbd>blank</kbd> number of years, you'll meet many, many different people. Some will amaze you, others support you. Some will make you laugh and others will make you cry. But know now that you are surrounded by some of the greatest minds Stuyvesant High School has to offer. That being said! If you're going to be a member of this team, it's time to start acting like one. Today's activity will not only test your ability as software engineers, but also your ability to work as a group. Each breakout room will be splitting into two small groups, and will **not be sharing any materials**. You are expected to complete your half of the exercise on your own, only to reconvene at the end of the working period to see if your code works when put together. That means entrusting certain aspects of the Point-Triangle problem to your "roommates", and more pressingly, merging git branches for a cohesive final product worth testing.

### So... what's the activity itself?
The activity itself will be to code (from scratch) a **Point** and **Triangle** class. **Triangle**s are *made up of* **Point**s, meaning that **Point**s need **Triangle**s to fully function, and **Triangle**s need **Point**s to exist.

#### Point
```
Point(x, y)
Point(p)
toString()
getX()
getY()
setX(new x)
setY(new y)
* distanceBetween(p1, p2)
distanceTo(other)
```

#### Triangle
```
Triangle(p1, p2, p3)
Triangle(x1, y1, x2, y2, x3, y3)
toString()
getPerimeter()
getVertex(n)
setVertex(n, p)
```
