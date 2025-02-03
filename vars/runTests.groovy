def call(path) {
    sh """
    . .venv/bin/activate
    python -m pytest ${path}
    """
}
