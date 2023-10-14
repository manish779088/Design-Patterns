The Observer pattern is an important behavioral design pattern.
It allows objects (observers) that have subscribed to an event to wait for
input and react to it when notified. Therefore, they don’t have to continuously
keep checking whether the input has been provided or not.
 The main subject maintains a list of all the observers, and whenever the event occurs,
 it notifies the observers so they can update their states accordingly.

Let’s look at a real-life example that we can map to this pattern.
Consider a website that posts interesting articles.
Every day, you visit the site to check for new articles, and if there are none,
you revisit after some time.
What if you get a subscription to the website instead? Once you have the subscription,
you’ll get notified every time a new article is posted.
So now, instead of checking the site every few hours,
you just wait for the notification about a new article.