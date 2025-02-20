from setuptools import setup

setup(
    name="simple_calc",
    version="0.1",
    scripts=["calcolatrice.py"],
    install_requires=[],
    entry_points={
        "console_scripts": [
            "py_calc = calcolatrice:main",
        ],
    },
    description="Un'applicazione Python a riga di comando per operazioni matematiche di base.",
    long_description=open('README.md').read(),
    long_description_content_type="text/markdown",
    author="Simone",
    python_requires=">=3.6",
)
