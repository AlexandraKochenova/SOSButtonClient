# -*- coding: utf-8 -*-
"""
Created on Wed Sep 18 19:34:32 2019

@author: 123
"""

from flask import Flask
import json
app=Flask(__name__)

id = 0

@app.route("/")
def hello():
    return "Hello World!"

@app.route("/<username>", methods=['GET'])
def index(username):
    print(username + " GET");
    global id
    id+=1
    response = {"id": id, "username": username}
    response_json = json.loads(response)
    return response_json


if __name__ == "__main__":
    app.run(host='0.0.0.0', port=3149)

