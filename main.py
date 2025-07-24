try:
    from dotenv import load_dotenv
    import os

    from extract_resume import extract_text
    from analyze_resume import analyze_text
    from resume_local_llm import summarize_text

    print("🚀 Resume Analyzer Starting...")

    resume_path = "resumes/Hitesh_M_Resume_2025.docx"

    # Step 1: Extract
    print("📄 Extracting resume...")
    text = extract_text(resume_path)
    print("✅ Extracted text preview:")
    print(text[:300])  # First 300 characters

    # Step 2: Analyze
    print("🧠 Analyzing...")
    entities, skills = analyze_text(text)



    print("\n🔍 Named Entities:")
    for label, ent in entities:
        print(f"{label:10}: {ent}")

    print("\n✅ Detected Skills:")
    print(", ".join(skills))

    # Step 3: Summarize (Optional)
    print("\n📋 Summary:")
    summary = summarize_text(text)
    print(summary)

except Exception as e:
    print("❌ Error occurred:", str(e))
