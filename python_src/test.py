from flask import Flask, render_template, request, redirect, url_for
import os

app = Flask(__name__)

def clear_screen():
    os.system('cls' if os.name == 'nt' else 'clear')

def welcome_message():
    return "Seja bem-vindo(a) ao App Senai!"

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/iniciar', methods=['POST'])
def iniciar():
    clear_screen()
    welcome_msg = welcome_message()
    entrar = request.form.get('entrada')
    
    if entrar == '1':
        return render_template('menu.html', message=welcome_msg)
    else:
        return "Software encerrado!"

if __name__ == "__main__":
    app.run(debug=True)
