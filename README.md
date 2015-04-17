Kannur University API
=====================

A java library, which provides a simple way to download pdf's of mark lists and hall tickets from www.kannuruniversity.ac.in of students

API uses [Apache Http Package](https://hc.apache.org/) for making requests and gettings responses, and [Jsoup](http://jsoup.org/) for finding the request url from the input url (web scraping)

How to Use
----------

Download the jar file [kannur-university-1.0.jar](https://github.com/4k3R/kannur-university/blob/master/kannur-university-1.0.jar?raw=true) and set class path in java. Alternatively add the library to your build path in your favorite IDE.

Example
-------

### Downloading hall ticket

Requires register number and birthday to be set

```
HallTicket anjith = new HallTicket("B1ENCS5106", "28", "8", "1993");
RequestUri uri = new RequestUri("http://14.139.185.42/kannur/assistant/online/btech8regular2015/btech8thhal.php");
uri.parseRequestUri();
NetworkCall call = new NetworkCall();

if (call.requestHallTicket(anjith, uri) > 0) {
    System.out.print("Success");
}
else {
    System.out.print("Failure");
}
```

### Downloading mark list

Requires register number and exam type to be set
- R - Regular
- S - Supply
- I - Improvement

```
MarkList anjith = new MarkList("B1ENCS5106", "R");
RequestUri uri = new RequestUri("http://14.139.185.42/kannur/assistant/btech7Result112014ren/btech7th.php");
uri.parseRequestUri();
NetworkCall call = new NetworkCall();

if (call.requestMarkList(anjith, uri) > 0) {
    System.out.print("Success");
}
else {
    System.out.print("Failure");
}
```

License
-------
Kannur University API is released under MIT Licence. See file LICENCE.
