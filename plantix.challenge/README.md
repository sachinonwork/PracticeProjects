# Plantix Community Coding Challenge

## Background

[Plantix Community](https://plantix.net/community/) is a social network of plant experts, 
supporting each other in diagnosing plant diseases. Each expert is identified by a unique 
ID and has a list of plant topics they have given advice on. Experts may also follow 
other experts (by unique ID):  

```
------------------------------------
  PlantExpert
------------------------------------
    uid:          String
    topics:       List[String]
    following:    List[String]
```

You can fetch a `PlantExpert` by `uid` from the Plantix Community REST API. 
Our Python SDK (`plantix/sdk.py`) already implements this API call for you:

```shell script
$ python -m plantix.service &
```

```pydocstring
>>> from plantix.sdk import *
>>> PlantixApiClient().get(uid="foo")
<PlantExpert uid=foo, following=bar,baz>
```

## The challenge

> Suppose your Plantix Community UID is 0. Find the N most common topics in 
> your entire Plantix network. 

1. Implement a new SDK method `plantix.sdk.PlantixApiClient.find_topics(start, n)`. 
   It must return a sorted list of the `n` most frequent topics found in the profile
   of a user with `uid=start` or any other expert reachable from her, at any depth.
   
   For example, if user `foo` is an expert on `tomato` and connected to 5 other 
   experts on `tomato`, 3 on `banana`, and 10 on `cucumber`:
   
   ```pydocstring
   >>> from plantix.sdk import *
   >>> PlantixApiClient().find_topics(start="foo", n=2)
   [
        ('cucumber', 10), 
        ('tomato',    6)
   ]
   ```
   
2. Write unit-tests and a simple integration test for `PlantixApiClient`. 

3. Write a small technical design doc to formulate the technical problem and 
   document your approach to solving it. Discuss the scale of the problem and how 
   your architecture would handle networks of such magnitude. Prove your hypothesis 
   with running time and memory complexity analysis of the average and worst cases.  
   How big do you think one's network can be in the absolute worst case? Discuss 
   how you plan to engineer the SDK for testability.
   
4. Attach a single zip archive containing all of your source code (1-2) and 
   design doc (3) for review. Start the development server (`plantix.service`),
   execute the included `cli.py` app and submit the console output as an answer 
   in your application:
    
   ```shell script
   $ python -m plantix.service &
   $ python cli.py
   
   Top 4 topics in the network of 0
   --------------------------------
     10 mango
      5 tomato
     ...
   ```

## Requirements

- This is a small task. If you find yourself writing a lot of code, you might 
  want to pivot in your approach.
  
- Write production-quality, correct, elegant, maintainable, testable, tested, 
  documented and scalable code. Show us your best work. Feel free to remodel 
  the `PlantixApiClient` class or use functional programming. Code must be 
  well engineered and tests FIRST. You can't change `PlantExpert`. Treat 
  `plantix.service` as a black box and pretend it is running the cloud.
  
- You have enough RAM to fit all Plantix expert uid-s in memory twice, but 
  not more. Your solution must scale. You can't assume anything about the 
  network of any expert other than the absolute worst-case scenario. 
  
- The recommended programming language is Python. If you don't know Python, you 
  only need to re-implement `sdk.py` and `main.py` (you still need Python 3 
  to run the server via `python -m plantix.service`). You can use the standard 
  library of your language, but not other packages. Mocking is also discouraged.
  
- Format your code the way you normally would when working in a team. Show us 
  your best work as a future mentor. If using Python, follow PEP8 and provide 
  type annotations and docstrings.
  
- Writing a great design doc is equally important. Show us how you design systems, 
  lead teams and communicate with other senior engineers when solving technical 
  challenges. This should be a regular design doc you would normally write and 
  submit for review if your team were assigned to work on this system and 
  deliver the solution. Include all the usual parts - e.g. Background, Motivation, 
  Scope, Architecture, Scalability, Testing. This is just an example; use your 
  preferred style and format.
  
  
## Evaluation

Your submission will be evaluated for *all* of the following criteria:

- problem-solving
- correctness 
- scalability, time and space complexity
- SOLID OOP or FP design
- testability and test engineering 
- clean code
- technical design, writing, and communication 

All criteria are of equal weight.
