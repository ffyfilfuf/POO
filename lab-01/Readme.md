# Sistema de Controle de Versão

## Configuração inicial para uso do Git

### Configuração de nome de usuário e e-mail no Git
É necessário configurar o nome de usuário e o e-mail no Git porque cada commit realizado precisa estar associado a um autor. Essas informações ficam registradas no histórico do repositório, permitindo identificar quem fez cada alteração no código. Sem essa configuração, o Git pode impedir a realização de commits ou registrar dados incompletos, comprometendo o controle adequado das versões do projeto.

```
git config --global user.name "Seu nome"

git config --global user.email "Seu email"

git config --global alias.tree "log --oneline --graph --decorate --all"
```

### Criando Personal Access Token (PAT) no GitHub
Um Personal Access Token (PAT) é um código gerado no GitHub que substitui a senha para autenticação em operações como push, pull e acesso a repositórios via HTTPS.

Ele é necessário porque o GitHub não permite mais o uso de senha para essas operações. O PAT garante mais segurança e permite definir permissões específicas de acesso.

1. Clique na foto do usuário
1. Vá em Settings
git config --global alias.tree "log --oneline --graph --decorate --all"
1. Em Developer settings
1. Personal access tokens
1. Vá em Token
1. Por fim em Generate new token (classic)

### Salvar em cache as credenciais do PAT
Salvar em cache as credenciais do Personal Access Token (PAT) evita que o usuário precise informar o token manualmente a cada operação com o GitHub. Isso torna o fluxo de trabalho mais ágil e produtivo, reduz interrupções e minimiza erros de digitação. Além disso, o armazenamento em cache mantém a autenticação válida durante a sessão configurada, facilitando o uso contínuo do repositório

```
git config --global credential.helper 'cache --timeout=3600'
```

## Qual a diferença entre git merge e git rebase?

Tanto o git merge quanto o git rebase servem para juntar alterações de uma branch em outra, mas fazem isso de jeitos diferentes.

O git merge junta as duas branches e cria um commit de merge. Ele mantém todo o histórico original. É mais seguro para usar em branches que já foram compartilhadas com outras pessoas.

Já o git rebase “move” seus commits para o topo da outra branch, como se você tivesse começado a trabalhar a partir da versão mais atual. Ele deixa o histórico mais linear e organizado, mas reescreve os commits. Por isso, é melhor usar em branches locais que ainda não foram enviadas para o remoto.
