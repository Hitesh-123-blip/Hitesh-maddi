from dotenv import load_dotenv
import os
import openai

# Load your OpenAI API key
load_dotenv(dotenv_path="api/secrets.env")
api_key = os.getenv("OPENAI_API_KEY")

if not api_key:
    raise ValueError("API key not found in api/secrets.env")

openai.api_key = api_key

def summarize_text(text):
    response = openai.ChatCompletion.create(
        model="gpt-3.5-turbo",
        messages=[
            {"role": "user", "content": f"Summarize this resume:\n{text}"}
        ],
        temperature=0.7
    )
    return response['choices'][0]['message']['content']
