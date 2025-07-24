import spacy

nlp = spacy.load("en_core_web_sm")

def analyze_text(text):
    doc = nlp(text)
    
    named_entities = [(ent.label_, ent.text) for ent in doc.ents]
    
    skills = [
        "Python", "Java", "SQL", "Machine Learning", "Data Science",
        "Power BI", "TensorFlow", "Keras", "AWS", "Azure"
    ]
    found_skills = [skill for skill in skills if skill.lower() in text.lower()]
    
    return named_entities, found_skills
