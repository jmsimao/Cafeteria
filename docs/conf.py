# -- Informações do projeto -------------------------------------------------

project = 'Cafeteria'
author = 'Jose Simão'
release = '0.1.0'  # versão exibida na doc

# -- Configurações gerais ---------------------------------------------------

extensions = []              # sem extensões adicionais
templates_path = ['_templates']
exclude_patterns = ['_build', 'Thumbs.db', '.DS_Store']

# -- Saída HTML -------------------------------------------------------------

html_theme = 'alabaster'     # tema padrão do Sphinx
html_static_path = ['_static']
